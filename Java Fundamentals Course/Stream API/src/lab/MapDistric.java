package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class MapDistric {
    private static Map<String, List<Integer>> cities = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] data = in.readLine().split("\\s+");
        int bound = Integer.parseInt(in.readLine());
        fillMap(data, bound);
        print(bound);
    }

    private static void fillMap(String[] data, int bound) {
        for (String currentCity : data) {
            String[] split = currentCity.split(":");
            String cityName = split[0];
            int population = Integer.parseInt(split[1]);
            cities.putIfAbsent(cityName, new ArrayList<>());
            List<Integer> temp = cities.get(cityName);
            temp.add(population);
            cities.put(cityName, temp);
        }
    }

    private static void print(int bound) {

        Comparator<Map.Entry<String, List<Integer>>> comparator = (o1, o2) -> {
            int sum1 = o1.getValue().stream().mapToInt(Integer::intValue).sum();
            int sum2 = o2.getValue().stream().mapToInt(Integer::intValue).sum();
            return Integer.compare(sum2, sum1);
        };

        cities = cities.entrySet().stream()
                .filter(x -> x.getValue().stream().mapToInt(Integer::intValue).sum() >= bound)
                .sorted(comparator)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        for (Map.Entry<String, List<Integer>> currentPair : cities.entrySet()) {
            System.out.printf("%s: ", currentPair.getKey());
            List<Integer> list = currentPair.getValue();
            Comparator<Integer> comparatorList = (o1, o2) -> Integer.compare(o2, o1);
            list = list.stream().sorted(comparatorList).limit(5).collect(Collectors.toList());
            for (Integer integer : list) {
                System.out.printf("%s ", integer);
            }
            System.out.println();
        }
    }
}
