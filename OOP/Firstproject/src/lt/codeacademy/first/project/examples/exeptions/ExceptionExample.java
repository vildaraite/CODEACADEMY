package lt.codeacademy.first.project.examples.exeptions;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExceptionExample example = new ExceptionExample();

		/*try {
			int value = scanner.nextInt();
			System.out.println(value);
		} catch(InputMismatchException ex) {
			System.out.println("Bloga ivestis");
		} finally {
			System.out.println("Kvieciamas visada");
			//scanner.close();
		}
		try {
			example.testException();
		} catch(Exception e) {
			System.out.println("Upssss");
		}
		try {
			example.testRuntimeException();
		} catch(RuntimeException e) {
			System.out.println("Runtime exception");
		}
		try {
			System.out.println(scanner.nextInt());
		} finally {
			System.out.println("Kvieciamas visada");
		}
		try {
			System.out.println(scanner.nextInt());
		} catch(InputMismatchException e) {
			//action 1
		} catch(IllegalStateException e) {
			//action 2
		} catch(NoSuchElementException e) {
			//action 3
		} catch(RuntimeException e) {
			//action 4
		} catch(Exception e) {
			//action 5
		}
		try {
			System.out.println(scanner.nextInt());
		}catch(InputMismatchException e) {
			//action 1
		} catch(IllegalStateException | NoSuchElementException e) {
			//action 2
		}
		try {
			example.testCustomException();
		} catch(CustomException e) {
			System.out.println("Custom exception");
		}*/

        try {
            example.testCustomRuntimeException();
        } catch(CustomRuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getName());
        }
    }

    //Checked exception arba compile time exception
    private void testException() throws Exception {
        // metama klaida su throw zodeliu
        throw new Exception("This is exception");
    }

    //unchecked exception arba runtime exception
    private void testRuntimeException() {
        throw new RuntimeException("This is runtime exception");
    }

    private void testCustomException() throws CustomException {
        throw new CustomException();
    }

    private void testCustomRuntimeException() {
        throw new CustomRuntimeException("My custom exception", "Vilda");
    }
}