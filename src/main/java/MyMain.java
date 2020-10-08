public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int rounds = 10000;
        int six = 0;
        for (int i = 0; i < rounds; i++){
            boolean success = false;
            for (int h = 0; h < 6; h++){
                if ((int)(Math.random()*6) + 1 == 6){
                    success = true;
                }
            }
            if (success)
                six++;
        }
        double x = (double)six / rounds;
        double percent = (double) x * 100;
        return percent;

    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int rounds = 10000;
        int six = 0;
        for (int i = 0; i < rounds; i++){
            
            for (int h = 0; h < 6; h++){
                if ((int)(Math.random()*6) + 1 == 6){
                    six++
                }
            }

        }
        double x = (double)six / rounds;
        double percent = (double) x * 100;
        return percent;

    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int rounds = 10000;
        int six = 0;
        for (int i = 0; i < rounds; i++){
            
            for (int h = 0; h < 6; h++){
                if ((int)(Math.random()*6) + 1 == 6){
                    six++
                }
            }

        }
        double x = (double)six / rounds;
        double percent = (double) x * 100;
        return percent;

    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
