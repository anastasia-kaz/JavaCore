package homework_20;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGenerator implements Callable<List<String>> {

    private int task;

    public FileGenerator(int task) {
        this.task = task;
    }

    public String generateRandomString(int length) {
        StringBuilder randomStr = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            char randomChar = (char) (' ' + random.nextInt(235));
            randomStr.append(randomChar);
        }

        return randomStr.toString();
    }

    @Override
    public List<String> call() throws Exception {
        List<String> generatedFiles = new ArrayList<>();
        Random random = new Random();

        String taskFolder = "src/homework_20/task_" + task;
        java.io.File folder = new java.io.File(taskFolder);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        for (int i = 0; i < 10; i++) {
            String name = taskFolder + "/file_task" + task + "_" + i + ".txt";
            System.out.println("Поток " + Thread.currentThread().getName() +
                    " выполняет задачу " + task +
                    " - создает файл " + name);

            try (FileWriter fileWriter = new FileWriter(name)) {
                for (int j = 0; j < 10; j++) {
                    fileWriter.write(generateRandomString(50));
                    fileWriter.write(System.lineSeparator());
                }
            }

            generatedFiles.add(name);

            int sleepTime = 500 + random.nextInt(2000);
            Thread.sleep(sleepTime);

        }

        return generatedFiles;
    }


}
