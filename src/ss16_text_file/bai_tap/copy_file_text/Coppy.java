package ss16_text_file.bai_tap.copy_file_text;

import java.io.*;

public class Coppy {
    public String readFile(String fileUrl){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String repo = "";
        try {
            File file = new File(fileUrl);
            if (!(file.exists())) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            while ((temp = bufferedReader.readLine()) != null) {
                repo += temp;
            }
            System.out.println(repo);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return repo;
    }

    public void writeFile(String fileUrl, String fileText) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(fileUrl);
            if (!(file.exists())) {
                throw new FileNotFoundException();
            }
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\n"+fileText);
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        String fileUrl = "src/ss16_text_file/bai_tap/copy_file_text/firstData";
        String fileUrl1 = "src/ss16_text_file/bai_tap/copy_file_text/lastData";
        Coppy coppy = new Coppy();
        String temp = coppy.readFile(fileUrl);
        coppy.writeFile(fileUrl1,temp);

    }
}
