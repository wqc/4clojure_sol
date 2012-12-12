(
	fn sol [ coll ](
	
		reduce ( 
			fn cnt[ set1 x ] (
				assoc set1 x ( count ( filter #( = % x)  coll) )
			)
		)	
		{} ( set coll )
	) 
)
