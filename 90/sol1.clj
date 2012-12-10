(
	fn sol[ coll1 coll2 ] (
		set (
		mapcat ( 
			fn f [ x ] (
				map #( list % x ) coll1
			) 
		) coll2 ) 
	)
)
