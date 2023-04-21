package ss16_text_file.bai_tap.doc_file;

import java.io.*;

public class DocFlile2 {
    public void display(String fileUrl) throws IOException {
        File file = new File(fileUrl);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        if (!(file.exists())){
            throw new FileNotFoundException();
        }
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String read = "";
            while ((read = bufferedReader.readLine()) != null){
                System.out.println(read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileReader.close();
        }
    }
    public static void main(String[] args) throws IOException {
        DocFlile2 docFlile2 = new DocFlile2();
        String repo = "src/ss16_text_file/bai_tap/doc_file/dataText.csv";
        docFlile2.display(repo);

    }
}
