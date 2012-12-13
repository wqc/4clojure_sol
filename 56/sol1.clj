(
	fn sol [ coll ] (
		let[ f (
				fn f1 [ col1 res1 ] (
					
					if( = 0 ( count col1 ) ) 
					
					( reverse res1 )
					(
							if( ( set res1 ) ( first col1 ) ) 
							( f1 ( rest col1 ) res1 )
							( f1 ( rest col1 ) ( cons ( first col1 ) res1 ) ) 
					)

				)
			)
		] ( f coll [  ] ) 
	)
)

