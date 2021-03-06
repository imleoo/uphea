package com.uphea.domain.constraint;

import jodd.vtor.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation for {@link BirthYearConstraint}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Constraint(BirthYearConstraint.class)
public @interface BirthYear {

	// ---------------------------------------------------------------- common

	/**
	 * Profiles.
	 */
	String[] profiles() default {};

	/**
	 * Severity.
	 */
	int severity() default 0;

}
