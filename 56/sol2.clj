(
	fn sol [ coll ] (
		reduce #(  
			if((  set %1 ) %2 )
				%1
				( conj %1 %2 )
		) [] coll
	)
)
