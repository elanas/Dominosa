public class ParallelDominosa implements Runnable {

    private int thread_id;

    public void run() {

    }

    public ParallelDominosa(int id) {
        this.thread_id = id;
    }

    public static void main(String[] args) {

        int numthreads = Integer.parseInt(args[0]);

        for(int i = 0; i < numthreads; i++) {
            new Thread(new ParallelDominosa(i)).start();
        }

    }

}