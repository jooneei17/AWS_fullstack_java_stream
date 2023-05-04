import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subway {
    public static void main(String[] args) throws IOException {
        // csv => List<Map<String, Object>>
        // 파일 리더로 가져오기.
        // 한 줄씩 읽어옴 (한 줄은 String 타입)

        List<String> inputListString = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:/workspaces/eclipse-workspace/STREAM/src/CARD_SUBWAY_MONTH_202303 copy.csv"),
                "utf-8"));

        String str = null;
        while ((str = br.readLine()) != null) {
            inputListString.add(str);
        }
        System.out.println(inputListString);
        br.close();

        // inputListString.stream().map(String >> map) : List<Map<String, Object>>

        // 집계
        // max, min, sum, avg, count

        // 날짜별(10일 단위)
        // inputListString.stream().collect(Collectors.groupingBy())

    }
}
