(
	fn sol [ n ](


		map (


			let[ fib #( reduce *  ( range 1 ( inc % ) )       ) ] (


				fn comb [ x ] (
				
				
					if( zero? x ) 1
					( 
					
					if ( = ( dec n ) x )  1  
						
					(   / 
				    	( fib ( dec n ) ) 
					    ( * ( fib x ) ( fib ( - n 1 x ) ) ) 
					 
					)   
					
					
						
					) 
				
				
				) 
			
			
			) 
					
					 
		)         ( range n )


	) 
)
