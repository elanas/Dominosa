import java.util.ArrayList;

public class ParallelPairMapping implements Runnable{


    private int thread_id;
    private static ArrayList<ArrayList<ParallelDominosa.DomLoc>> pairMappings;
    private int numTodo;

    public void run() {

        System.out.println("Running Thread: " + thread_id);


        for(int i = thread_id*numTodo; ((i < thread_id*numTodo + numTodo) && (i < pairMappings.size())); i++) {
            System.out.print("i: " + i + " ");
        }

        System.out.println("");

        // for(ArrayList<DomLoc> domlist : pairMappings) {
        //         int countAvail = 0;
        //         DomLoc currDomLoc = null;
        //         for(DomLoc dl : domlist) {
        //             if (dl.isAvailable) {
        //                 countAvail++;
        //                 currDomLoc = dl;
        //             }
        //         }

        //         //if there's only one, choose it. Mark overlaps as unavailable
        //         if (countAvail == 1) {
        //             chooseDomLoc(currDomLoc);
        //             chosenDoms++;
        //             madeChange = true;
        //         }
        //     }

    }

    public ParallelPairMapping(int id, ArrayList<ArrayList<ParallelDominosa.DomLoc>> pairMappings, int numTodo) {
        this.thread_id = id;
        this.pairMappings = pairMappings;
        this.numTodo = numTodo;
    }

    // public static void main(String[] args) {

    //     int numthreads = Integer.parseInt(args[0]);

    //     for(int i = 0; i < numthreads; i++) {
    //         new Thread(new ParallelPairMapping(i)).start();
    //     }

    // }


}