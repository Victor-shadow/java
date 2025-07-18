package Collections;

import java.util.*;

class BinarySearchUserDefinedClassObjects {
    public static void main(String[] args) {
        // 🚀 Step 1: Create a list of Domain objects
        List<Domain> list = new ArrayList<>();
        list.add(new Domain(10, "www.geeksforgeeks.org"));
        list.add(new Domain(20, "practice.geeksforgeeks.org"));
        list.add(new Domain(30, "code.geeksforgeeks.org"));
        list.add(new Domain(40, "www.geeksforgeeks.org"));

        // 🔧 Step 2: Create a comparator that compares Domain objects by their ID
        Comparator<Domain> c = new Comparator<Domain>() {
            @Override
            public int compare(Domain o1, Domain o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };

        // 📊 Step 3: Sort the list before using binarySearch (important!)
        Collections.sort(list, c);

        // 🔍 Step 4: Search for Domain object with ID 10
        int index = Collections.binarySearch(list, new Domain(10, null), c);
        System.out.println("Search for ID 10 → Found at index: " + index);

        // 🔍 Search for Domain object with ID 5 (not in list)
        index = Collections.binarySearch(list, new Domain(5, null), c);
        System.out.println("Search for ID 5 → Found at index: " + index);
    }
}

// 🧱 Step 5: Define the Domain class with constructor and getter
class Domain {
    private int id;
    private String url;

    // ✅ Correct constructor (no return type!)
    public Domain(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public Integer getId() {
        return Integer.valueOf(id);
    }

    public String getUrl() {
        return url;
    }
}

//Arrays.binarySearch() vrs Collections.binarySearch()
//Arrays.binarySearch() works for arrays which can be of primitive data types
//Collections.binarySearch() works for Objects Collection like ArrayList, LinkedList