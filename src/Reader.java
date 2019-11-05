import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Student.DESKTOP-VNR47RU\\Zad_1\\src\\File.txt");
        String line;
        Scanner scanner=null;

        try {
            scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        while (scanner.hasNext()){
            line=scanner.nextLine().replaceFirst(" ","\t");
            System.out.println(line);
            String[] fileDivision=line.split("\t",8);

            String position=fileDivision[0];
            int tempPosition=Integer.valueOf(position);
            System.out.println(tempPosition);

            System.out.println(fileDivision[1]);
            System.out.println(fileDivision[2]);
            System.out.println(fileDivision[3]);

            String age=fileDivision[4];
            int tempAge=Integer.valueOf(age);
            System.out.println(tempAge);

            String points=fileDivision[5];
            int tempPoints=Integer.valueOf(points);
            System.out.println(tempPoints);

//            String tournaments=fileDivision[6];
//            int tempTournaments=Integer.valueOf(tournaments);

//            Tenisista tenisista=new Tenisista(tempPosition,fileDivision[1],fileDivision[2]
//                    ,fileDivision[3],tempAge,tempPoints,tempTournaments);
//            System.out.println(tenisista);
        }//end o while


    }//end of main
}//end of class
