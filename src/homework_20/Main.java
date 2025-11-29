package homework_20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<List<String>>> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            FileGenerator fileGenerator = new FileGenerator(i);
            Future<List<String>> future = executorService.submit(fileGenerator);
            futureList.add(future);
        }

        for (int i = 0; i < 10; i++) {
            try {
                List<String> result = futureList.get(i).get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();

    }
}
