Team 8 - Lovejit Hari

	 Vincent Povio
	
	 Kevin Nguyen


Created 2 classes, an Entry object class as well as the simulator class.

The Entry class defines an Entry as an object with a port number, IP address and some hops number as parameters. Inside the constructor, there is also a timestamp at the creation of each Entry node.

The RouterTableSim class is simply a hardcoded routing table. 
We display the Port value, IP address, number of Hops from one router to other routers, as well as the time. 

We started with originally 4 nodes: A, B, C, & D and each node was interconnected. Our starting point was A and the routing table displays all the information for node A.

 A <-> B
 |     |	*****NOTE****** THIS ‘|’ MEANS THE SAME AS <->
 D <-> C

Then we displayed the routing table according to that information.

Adding a node that connected only to D created two new paths to that node from our starting point A. We demonstrated the values associated with that within our updated routing table.

   A <-> B
   |     |
   D <-> C
  /
 E

After that, we showed what would happen to our routing table when node C was removed.
It would remove a total of 5 paths and therefore 5 entries from our routing table would need to be updated. 

Finally, we reconnected node C and redisplayed our information with nodes A, B, C, D, & E present.