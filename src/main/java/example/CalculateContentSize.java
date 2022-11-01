package example;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CalculateContentSize
{
  public static void main(String[] args) throws IOException
  {
    //String fileName = "C:\\vitalitylife\\projects\\CRM\\5CRM lead xmls\\CQA\\SalesForce_RequestExample.json";
    String fileName = "C:\\vitalitylife\\projects\\salesforce\\request\\JSON - salesforce requests examples\\jl_quote_only_lc-with-sic.json";
    Path filePath = Paths.get(fileName);

    FileChannel fileChannel = FileChannel.open(filePath);
    long fileSize = fileChannel.size();

    System.out.format("The size of the file: %d bytes", fileSize);

  }
}
