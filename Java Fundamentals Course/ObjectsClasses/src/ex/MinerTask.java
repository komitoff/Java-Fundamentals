package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MinerTask {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, Integer> resources = fillResources();
        printResources(resources);
    }

    private static Map<String,Integer> fillResources() throws IOException {
        Map<String, Integer> resources = new HashMap<>();
        while (true) {
            String material = reader.readLine();

            if (material.equalsIgnoreCase("stop")) {
                break;
            }

            int quantity = Integer.parseInt(reader.readLine());

            if (!resources.containsKey(material)) {
                resources.put(material, 0);
            }

            resources.put(material, resources.get(material) + quantity);
        }
        return resources;
    }

    private static void printResources(Map<String, Integer> resources) {
        resources.forEach((x, y) -> System.out.println(String.format("%s -> %d", x, y)));
//        for (Map.Entry<String, Integer> resource : resources.entrySet()) {
//            System.out.println(String.format("%s -> %d", resource.getKey(), resource.getValue()));
//        }
    }
}
