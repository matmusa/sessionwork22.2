import java.io.IOException;
import java.util.Scanner;

public class Test {
    private final String[] test = {"Назовите страну с самой высокой продолжительностью жизни.\n",
            "Какую вершину сложно покорить? Ответ Вершину Эвереста\n" ,
                    "Кто написал «Ирисы»? Ответ Ван Гог\n" ,
                    "Сколько километров в одной миле? Ответ 1,6 км.\n" ,
                    "Именно этот философ проживал в бочке. Какой? Ответ Диоген\n" ,
                    "Назовите актёра, который сыграл Гарри Поттера. Ответ Дэниель Редклифф\n" ,""
    };


    private final String[] answers = {"Китай", "Карпат", "Да Винчи", "", "Сократ", "Маколей Калкин"};
    private final String[] answers2 = {"Норвегия", "Жениш", "Пикассо", "1.6", "Диоген", "Даниель Редклифф"};
    private final String[] answers3 = {"Исландия", "Эверест", "Ван Гог", "1.6", "Пифагор", "Эма Стоун"};

    public void tests() throws Exception {
        try {
            int coint = 0;
            String a = answers[0];
            String b = answers[0];
            String c = answers[0];
            while (true) {
                System.out.println(test[0] +
                        "\na)" + answers[0] +
                        "\nb)" + answers2[0] +
                        "\nc)" + answers3[0]);
                String s = new Scanner(System.in).nextLine();
                if (a.equals(answers[0]) ) {
                    coint += 5;
                    System.out.println(coint);
                } else {
                    throw new Exception("");
                }
                System.out.println(test[1] +
                        "\na)" + answers[1] +
                        "\nb)" + answers2[1] +
                        "\nc)" + answers3[1]);
                String q = new Scanner(System.in).nextLine();
                if (q == b) {
                    coint += 5;
                    System.out.println(coint);
                } else {
                }
                throw new Exception("");
            }
        } catch (Exception e) {
            System.out.println("error");

        }
    }

    public Test() {

    }

    public String[] getTest() {
        return test;
    }


}
