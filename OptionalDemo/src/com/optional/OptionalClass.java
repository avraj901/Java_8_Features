package com.optional;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		//empty
		//of
		//ofNullable
		Employee customer = new Employee(101,"avanish", null);
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println("Optional Empty :: "+emptyOptional);
		
		/*
		 * Optional<String> emailOptional = Optional.of(customer.getEmail());
		 * System.out.println("Optional.Of ::"+ emailOptional );
		 */
		
		Optional<String> optionalOfNullable = Optional.ofNullable(customer.getEmail());
		System.out.println("optionalNullable :: "+ optionalOfNullable);
		System.out.println(optionalOfNullable.get());
	}
}
