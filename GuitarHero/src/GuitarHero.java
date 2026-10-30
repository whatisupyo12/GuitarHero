//Ishan Meher
//Apurv Sahu
//Period 7

public class GuitarHero {

    public static void main(String[] args) {
    	
    	String keyboard = "q2we4r5ty7u8i9op-[=zxcdcfvgbnjmk,.;/' ";
        // Create two guitar strings, for concert A and C
        double CONCERT_A = 440.0;
        double CONCERT_C = CONCERT_A * Math.pow(2, 3.0/12.0);
        GuitarString stringA = new GuitarString(CONCERT_A);
        GuitarString stringC = new GuitarString(CONCERT_C);

        final double TEXT_POS_X = .2;
        final double TEXT_POS_Y = .5;
        
        StdDraw.text(TEXT_POS_X, TEXT_POS_Y, "Type 'a' or 'c' to play a note!");
        
        play(stringA, stringC);
    }
    
    private static void play(GuitarString stringA, GuitarString stringC) {        // the main input loop
        while (true) {
            
            // check if the user has typed a key, and, if so, process it
            if (StdDraw.hasNextKeyTyped()) {
 
                // the user types this character
                char key = StdDraw.nextKeyTyped();

                // pluck the corresponding string
                if (key == 'a') 
                    stringA.pluck();
                else if (key == 'c') 
                    stringC.pluck();
            }

            // compute the superposition of the samples
            double sample = stringA.sample() + stringC.sample();

            // send the result to standard audio
            StdAudio.play(sample);

            // advance the simulation of each guitar string by one step
            stringA.tic();
            stringC.tic();
        }
        
    }

}

