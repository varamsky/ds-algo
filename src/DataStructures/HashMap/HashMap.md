# Learn about the internal workings of a HashMap

1. Internal Workings of a HashMap
2. What is load factor?
	- The load factor is the measure that decides when to increase the capacity of the Map. The default load factor is 75% of the capacity.
	- When the Map is full then we need to increase the size and re-hash(re-calculate the hashes) the entire HashMap.
