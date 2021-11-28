List.of(1,1,2,2,3,4).stream().filter(i -> !List.of(1,3).contains(i)).collect(Collectors.toList());
