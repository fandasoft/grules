package org.grules.ast

import groovy.transform.InheritConstructors

@InheritConstructors
class UnsupportedExpressionException extends Exception {
	
	UnsupportedExpressionException(Class clazz) {
		super(clazz.name)
	}
	
}