/*
ruby…

[1,2,3].concat([4,5])
# => [1, 2, 3, 4, 5]

clojure…

(concat [1 2 3] [4 5])
;; => (1 2 3 4 5)

*/

Stream.concat(Stream.of(1,2,3), Stream.of(4,5))
	.collect(Collectors.toList());

/*

ruby…

[1,2,3].concat([4,5]).concat([6])
# => [1, 2, 3, 4, 5, 6]

clojure…

(concat [1 2 3] [4 5] [6])
;; => (1 2 3 4 5 6)

*/
Stream.concat(
		Stream.of(1,2,3), Stream.of(4,5)
	).concat(Stream.of(6))
	.collect(Collectors.toList());
