package com.xtremelabs.robolectric.internal;

/**
 * Indicates that a method declaration is intended NOT to Shadow a method with the same signature on the associated
 * Android class.
 *
 * E.g. The shadow class's toString() would give the wrong thing. I can't think of a better case.
 *
 * @see com.xtremelabs.robolectric.internal.Implementation
 */
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
public @interface ImplementationAverted
{
}
