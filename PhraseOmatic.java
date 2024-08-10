//this program aims to make three list of different words and generating random phrases from those lists 
public class PhraseOmatic{
    public static void main(String[] args){
        //make three sets of words to choose from 
        String [] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", 
        "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
        String [] wordListTwo = {"loosely coupled", "six sigma","asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", 
        "microservices", "distributed ledger"};
        String [] wordListThree = {"framework", "library","DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design", 
        "orientation"};
        //find out how many words are in each list 
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threLength = wordListThree.length;
        // generating three random numbers 
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threLength);
        //now building a phrase 
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("what we need is a " + phrase);

    }
}
