import static java.util.stream.Collectors.toList;

/*

ruby…

[1,2,3].map {|i| i * i}  
# => [1, 4, 9]

clojure…

(map #(* % %) [1 2 3])
;; => (1 4 9)

*/

List.of(1,2,3).stream().
	map(i -> i * i).collect(Collectors.toList());


/*
ruby…

{BR: 'Brazil', DE: 'Germany'}.map{|k,v| format("%s (%s)", v, k)}
# => ["Brazil (BR)", "Germany (DE)"]
*/

Map.of("BR", "Brazil", "DE", "Germany").entrySet().stream().
	map(e -> String.format("%s, (%s)", e.getKey(), e.getValue())).
	forEach(System.out::println);
