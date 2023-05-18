package lt.codeacademy.first.project.examples.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JAEncodeDecodeTask {
    private static final String CODES = "32 tarpas;65 A;82 R;105 i;33 !;66 B;83 S;106 j;44 ,;67 C;84 T;" +
            "107 k;46 .;68 D;85 U;108 l;48 0;69 E;86 V;109 m;49 1;70 F;87 W;110 n;50 2;71 G;88 X;111 o;" +
            "51 3;72 H;89 Y;112 p;52 4;73 I;90 Z;113 q;53 5;74 J;97 a;114 r;54 6;75 K;98 b;115 s;55 7;76 L;" +
            "99 c;116 t;56 8;77 M;100 d;117 u;57 9;78 N;101 e;118 v;63 ?;79 O;102 f;119 w;80 P;103 g;120 x;" +
            "81 Q;104 h;121 y;122 z";
    private static final String SPACE = " ";

    private final Map<String, String> encodes = new HashMap<>(); //key: raide, value: koduote
    private final Map<String, String> decodes = new HashMap<>(); //key: koduote, value: raide

    public static void main(String[] args) {
        JAEncodeDecodeTask jaEncodeDecode = new JAEncodeDecodeTask();
        jaEncodeDecode.fillUpMaps();

        Scanner sc = new Scanner(System.in);

        String action;
        do {
            jaEncodeDecode.menu();
            action = sc.nextLine();
            jaEncodeDecode.selectAction(sc, action);
        }while(!action.equals("3"));
    }

    private void selectAction(Scanner sc,  String action) {
        switch(action) {
            case "1" -> encode(sc);
            case "2" -> decode(sc);
            case "3" -> System.out.println("Programa baigia darba");
            default -> System.out.println("Tokio pasirinkimo nera");
        }
    }

    private void encode(Scanner sc) {
        System.out.println("Iveskite nori uzkoduoti teksta:");
        String text = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(char c: text.toCharArray()) {
            String letter = String.valueOf(c);

            String code = encodes.get(letter);
            if(code == null) {
                System.out.printf("Tokios raides:%s koduotes nera%n",letter);
                continue;
            }
            sb.append(code).append(SPACE);
        }

        System.out.println("Uzkoduotas tekstas: " + sb.toString().trim());
    }

    private void decode(Scanner sc) {
        System.out.println("Iveskite norima decoduoti koduote:");
        String line = sc.nextLine();
        String[] splits = line.split(SPACE);

        StringBuilder sb = new StringBuilder();

        for(String s: splits) {
            String letter = decodes.get(s);
            if(letter == null) {
                System.out.printf("Tokios koduotes %s reiksmes nera%n", s);
                continue;
            }

            sb.append(letter);
        }

        System.out.println("Vertimas: " + sb);
    }

    private void menu() {
        System.out.println("""
								1. Encode to JA
								2. Decode from JA
								3. Exit
								   """);
    }

    private void fillUpMaps() {
        String[] pairs = CODES.split(";");
        for(String pair: pairs) {
            String[] splitPairs = pair.split(SPACE);

            if(splitPairs.length != 2) {
                continue;
            }

            String code = splitPairs[0];
            String letter = splitPairs[1].equals("tarpas") ? SPACE : splitPairs[1];

            encodes.put(letter, code);
            decodes.put(code, letter);
        }
    }
}