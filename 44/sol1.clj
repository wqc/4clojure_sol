(
	fn sol [ x coll ] (
			take ( count coll ) ( drop ( mod x ( count coll ) ) ( cycle coll ) )
	)
) 
