package lt.code.academy;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class LithuanianOfficialIdProvider implements OfficialIdProvider {

    @Override
    public String generateOfficialId(Person person) {
        StringBuilder sb = new StringBuilder();
        LocalDate date = person.getBirthDate();

        int genderNumb = Gender.getGenderNumber(date, person.getGender());
        sb.append(genderNumb)
                .append(date.getYear() % 100);

        if(date.getMonthValue() <= 9) {
            sb.append(0);
        }

        sb.append(date.getMonthValue())
                .append(date.getDayOfMonth())
                .append(Skaitliukas.n);

        int controlNumber = getOfficialIdControlNumber(sb.toString());
        sb.append(controlNumber);

        Skaitliukas.didintiVienetu();

        return sb.toString();
    }

    private int getOfficialIdControlNumber(String code) {
        List<Integer> codes = convert(code);
        //S = A*1 + B*2 + C*3 + D*4 + E*5 + F*6 + G*7 + H*8 + I*9 + J*1
        int s = getControlNumber(codes, 1);
        int k = s % 11;
        if(k != 10) {
            return k;
        }

        //S = A*3 + B*4 + C*5 + D*6 + E*7 + F*8 + G*9 + H*1 + I*2 + J*3
        s = getControlNumber(codes, 3);
        k = s % 11;
        if(k != 10) {
            return k;
        }

        return 0;
    }

    private int getControlNumber(List<Integer> codes, int count) {
        int s = 0;
        for(Integer numb: codes) {
            if(count == 10) {
                count = 1;
            }
            s += numb * count++;
        }

        return s;
    }

    private List<Integer> convert(String code) {
        return Arrays.stream(code.split(""))
                .map(Integer::valueOf)
                .toList();
    }
}