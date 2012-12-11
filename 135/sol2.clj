(
	fn sol [ a & coll ](
		reduce #( ( first %2 ) % ( last %2 ) ) a ( partition 2 coll ) 
	) 
)
