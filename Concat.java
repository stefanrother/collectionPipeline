/*
ruby…

[1,2,3].concat([4,5])
# => [1, 2, 3, 4, 5]

clojure…

(concat [1 2 3] [4 5])
;; => (1 2 3 4 5)

*/

Stream.concat(Stream.of(1,2,3), Stream.of(4,5)).collect(Collectors.toList());
