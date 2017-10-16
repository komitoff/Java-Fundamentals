package exam;

import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AshesOfRoses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Region> regions = new TreeSet<>();
        String input = reader.readLine();

        while (!input.equalsIgnoreCase("Icarus, Ignite!")) {
            String[] tokens = input.split("\\s+");
            String regionName = tokens[1].substring(1, tokens[1].length() - 1);
            String roseColor = tokens[2].substring(1, tokens[2].length() - 1);
            int count = Integer.parseInt(tokens[3]);

            if (!isRegionNameValid(regionName) || !isColorNotValid(roseColor)) {
                continue;
            }
            Region region = new Region();
            region.name = regionName;
            if (!regions.contains(region)) {
                regions.add(region);
            }

            if (!region.roseColor.containsKey(roseColor)) {

            }
            input = reader.readLine();
        }
    }

    private static boolean isColorNotValid(String roseColor) {
        //TODO: implement it
        return true;
    }

    private static boolean isRegionNameValid(String regionName) {
        //TODO: implement it
        return true;
    }

    public static class Region {
        public String name;
        public Map<String, Integer> roseColor = new TreeMap<>();

        public Region() {}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Region region = (Region) o;

            return name.equals(region.name);
        }
    }
}
