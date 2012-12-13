(
	fn sol
	( 
		[ f1 f2 ] ( 
			fn f [ & coll ](
				f1 ( apply f2 coll )
			)
		) 
	) 
	(
		[ f1 f2 & coll] (
				apply sol ( sol f1 f2 ) coll
		)
	)
)
