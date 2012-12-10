;; implements zipmap

(
	fn sol [ coll1 coll2 ] (
		if( and ( seq coll1 ) ( seq coll2 ) )
			( assoc ( sol ( next coll1 ) ( next coll2 ) ) ( first coll1 ) ( first coll2 ) )
			{}
	)
)
