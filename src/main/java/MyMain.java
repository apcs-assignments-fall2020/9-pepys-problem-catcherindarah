public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int rounds = 10000;
        int six = 0;
        double counter = 0.0;
        for (int i = 0; i < rounds; i++){
            for (int h = 0; h < 6; h++){
                if ((int)(Math.random()*6) + 1 == 6){
                    counter += 1;
                    break;
                }
            }
        }
        double x = (counter / rounds);
        double percent = x * 100;
        return percent;

    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int rounds = 10000;
        int six = 0;
        double counter = 0.0;
        int c = 0;
        for(int k = 0; k < rounds; k++){
            c = 0;
            for(int i = 0; i < 12; i++){
                six = (int)((Math.random()*6) +1);
                if(six == 6){
                    c += 1;
                }
                if(c == 2){
                    counter += 1;
                    break;
                }
            }
        }
        double percent = (counter/ rounds) * 100.0;
        return percent;

    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int rounds = 10000;
        int six = 0;
        double counter = 0.0;
        int c = 0;
        for(int k = 0; k < rounds; k++){
            c = 0;
            for(int i = 0; i < 18; i++){
                six = (int)((Math.random()*6) +1);
                if(six == 6){
                    c += 1;
                }
                if(c == 3){
                    counter += 1;
                    break;
                }
            }
        }
        double percent = (counter/ rounds) * 100.0;
        return percent;

    }


    public static void main(String[] args) {
        System.out.println("The probability of at least 1 six in 6 rolls is " + probabilityOneSix());
        System.out.println("The probability of at least 2 sixes in 12 rolls is " + probabilityTwoSixes());
        System.out.println("The probability of at least 3 sixes in 18 rolls is " + probabilityThreeSixes());
        
    }
}
