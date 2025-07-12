import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 정수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        List<Candidate> candidates = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int student = arr[i];
            boolean isAlreadyInFrame = false;

            for (Candidate c : candidates) {
                if (c.num == student) {
                    isAlreadyInFrame = true;
                    c.recommend++;
                    break;
                }

            }

            if (isAlreadyInFrame) continue;

            if (candidates.size() < N) {
                candidates.add(new Candidate(student, 1, i));
            } else {
                candidates.sort((o1, o2) -> {
                    if (o1.recommend == o2.recommend) {
                        return Integer.compare(o1.time, o2.time);
                    } else {
                        return Integer.compare(o1.recommend, o2.recommend);
                    }
                });
                candidates.remove(0);
                candidates.add(new Candidate(student, 1, i));
            }

        }

        // 최종 후보 번호 오름차순 출력
        candidates.sort(Comparator.comparingInt(c -> c.num));
        for (Candidate c : candidates) {
            System.out.print(c.num + " ");
        }
    }

    static class Candidate {
        int num;
        int recommend;
        int time;

        Candidate(int num, int recommend, int time) {
            this.num = num;
            this.recommend = recommend;
            this.time = time;
        }
    }

}
