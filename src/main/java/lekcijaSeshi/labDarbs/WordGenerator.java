package lekcijaSeshi.labDarbs;

import com.github.javafaker.Faker;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WordGenerator {
    public static void main(String[] args) throws IOException {
        //Blank Document
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream( new File("createdocument.docx"));
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        Faker faker = new Faker();
        run.setText(faker.shakespeare().hamletQuote());


        document.write(out);
        out.close();
        System.out.println("createparagraph.docx written successfully");
        System.out.println("createdocument.docx written successully");


    }
}
