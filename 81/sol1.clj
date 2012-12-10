(
	fn sol [ coll1 coll2 ] (
		reduce ( fn judge [ coll item ] (
				if( contains? coll2 item )
					coll
					( disj coll item ) 	

			)
		) coll1 coll1
	)
)
