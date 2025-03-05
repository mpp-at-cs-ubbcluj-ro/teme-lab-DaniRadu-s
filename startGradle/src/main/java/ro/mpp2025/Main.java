package ro.mpp2025;

import ro.mpp2025.domain.Arbitru;
import ro.mpp2025.repository.ArbitruRepository;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;


public class Main {
    public static void main(String[] args) {
        ArbitruRepository repo = new ArbitruRepository();
        System.out.println("Adaugam in repo ...");
        repo.add(new Arbitru(1,"Michael", "M", "Michael"));
        repo.add(new Arbitru(2,"Dani", "D", "Dani"));

        // System.out.println("searching element with id 3 "+repo.findById(3));
        System.out.println("Afisam datele din repository ...");
        for(Arbitru first: repo.findAll())
            System.out.println(first);

        System.out.println("Exemplu Multimap de la google.guava");
        Multimap<String,String> map= ArrayListMultimap.create();
        map.put("cheia1", "valoarea 1");
        map.put("cheia1", "valoarea 2");
        map.put("cheia2", "valoare noua");
        System.out.println(map);
    }
}