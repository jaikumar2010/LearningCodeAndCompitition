package com.excel.data;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelData {
    public static void main(String[] args)  {
        try{
        //File file = new File("C:\\Users\\Meow\\Downloads\\archive_space_mission\\mission_launches.xlsx");
            //System.out.println(file);

            String filePath = "C:\\Users\\Meow\\Downloads\\archive_space_mission\\mission_launches.csv";
        FileInputStream fileInputStream = new FileInputStream(
                new File("C:\\Users\\Meow\\Downloads\\archive_space_mission\\mission_launches.xlsx"));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("mission_launches");
        String[] columns = {"Unnamed: 0","Organisation","Location","Mission_Status"};
        Row rowsNumber = sheet.getRow(15);
int count = 0;
int cellCount = 0;
    for (Row row : sheet) {
        if(count < 10) {
            for (Cell cell : row) {

                if(cell.getCellType().equals(CellType.STRING))
                System.out.print(cell.getStringCellValue()+" ");


                /*switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print("\t");
                }
*/
            }
            System.out.println();
            count++;
        }else {
            break;
        }
    }
        workbook.close();
        fileInputStream.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }


    private static int[] getColumnIndexes(Sheet sheet, String[] headers) {
        int[] indexes = new int[headers.length];
        Row headerRow = sheet.getRow(0);
        for (int i = 0; i < headers.length; i++) {
            Cell headerCell = headerRow.getCell(i);
            String header = headerCell.getStringCellValue();
            int index = -1;
            for (int j = 0; j < headers.length; j++) {
                if (headers[j].equals(header)) {
                    index = j;
                    break;
                }
            }
            indexes[i] = index;
        }
        return indexes;
    }
}
