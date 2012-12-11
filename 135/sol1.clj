(

	fn sol
	(
		[a f b] ( f a b )
	)
	(
		[a f b & col] ( apply sol ( cons ( f a b ) col ) )
	)
)
