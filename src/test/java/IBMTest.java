public class IBMTest {

    public static void main(String[] args) {

            String input = "Mohan works in infosys as QA lead";
            String input2 = input.replace(" ", "");

            String output = "";
            String inputs[] = input.split(" ");
            int len = input2.length() - 1;
            for (int i = 0; i < inputs.length; i++) {
                for (int j = 0; j < inputs[i].length(); j++) {
                    output = output + input2.charAt(len);
                    len--;
                }
                output = output+' ';
            }
            System.out.println(output);

    }
    }














