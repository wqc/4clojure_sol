
(
	fn sol[ func coll ] (
		let [ s1 ( set ( map func coll ) )] (
				reduce (
						fn reducef [ s2 a ](
							assoc s2 a (
								filter #( = a ( func % ) ) coll 	
							)
						)
					) {} s1
		)
	)
)
