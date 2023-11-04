package task1;

public class Output {

    public static void main(String[] args) {

        Input input = new Input();
        Logic logic = new Logic();
        input.inputValues();
        System.out.println(logic.result(input.x, input.y));
    }

}
