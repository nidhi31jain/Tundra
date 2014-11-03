package tundra;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2014-11-03 13:50:28.642
// -----( ON-HOST: -

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class duration

{
	// ---( internal utility methods )---

	final static duration _instance = new duration();

	static duration _newInstance() { return new duration(); }

	static duration _cast(Object o) { return (duration)o; }

	// ---( server methods )---




	public static final void add (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(add)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $duration.x
		// [i] field:0:optional $duration.y
		// [i] field:0:optional $pattern.input {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [i] field:0:optional $pattern.output {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [o] field:0:required $duration
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		  String dx = IDataUtil.getString(cursor, "$duration.x");
		  String dy = IDataUtil.getString(cursor, "$duration.y");
		  String inPattern = IDataUtil.getString(cursor, "$pattern.input");
		  String outPattern = IDataUtil.getString(cursor, "$pattern.output");
		
		  IDataUtil.put(cursor, "$duration", add(inPattern, outPattern, dx, dy));
		} finally {
		  cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void compare (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(compare)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $duration.x
		// [i] field:0:optional $duration.y
		// [i] field:0:optional $pattern {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [o] field:0:required $lesser?
		// [o] field:0:required $equal?
		// [o] field:0:required $greater?
		// [o] field:0:required $indeterminate?
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		  String x = IDataUtil.getString(cursor, "$duration.x");
		  String y = IDataUtil.getString(cursor, "$duration.y");
		  String pattern = IDataUtil.getString(cursor, "$pattern");
		
		  int comparison = compare(x, y, pattern);
		
		  boolean lesser        = comparison == javax.xml.datatype.DatatypeConstants.LESSER;
		  boolean equal         = comparison == javax.xml.datatype.DatatypeConstants.EQUAL;
		  boolean greater       = comparison == javax.xml.datatype.DatatypeConstants.GREATER;
		  boolean indeterminate = comparison == javax.xml.datatype.DatatypeConstants.INDETERMINATE;
		
		  IDataUtil.put(cursor, "$lesser?",        "" + lesser);
		  IDataUtil.put(cursor, "$equal?",         "" + equal);
		  IDataUtil.put(cursor, "$greater?",       "" + greater);
		  IDataUtil.put(cursor, "$indeterminate?", "" + indeterminate);
		} finally {
		  cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void format (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(format)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $duration
		// [i] field:0:optional $pattern.input {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [i] field:0:optional $pattern.output {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;}
		// [i] field:0:optional $datetime
		// [i] field:0:optional $datetime.pattern {&quot;datetime&quot;,&quot;datetime.jdbc&quot;,&quot;date&quot;,&quot;date.jdbc&quot;,&quot;time&quot;,&quot;time.jdbc&quot;,&quot;milliseconds&quot;}
		// [o] field:0:optional $duration
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		  String duration = IDataUtil.getString(cursor, "$duration");
		  String datetime = IDataUtil.getString(cursor, "$datetime");
		  String inPattern = IDataUtil.getString(cursor, "$pattern.input");
		  String outPattern = IDataUtil.getString(cursor, "$pattern.output");
		  String datetimePattern = IDataUtil.getString(cursor, "$datetime.pattern");
		
		  duration = format(duration, inPattern, outPattern, datetime, datetimePattern);
		
		  if (duration != null) IDataUtil.put(cursor, "$duration", duration);
		} finally {
		  cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void multiply (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(multiply)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $duration
		// [i] field:0:optional $pattern.input {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [i] field:0:optional $pattern.output {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [i] field:0:optional $datetime
		// [i] field:0:optional $datetime.pattern {&quot;datetime&quot;,&quot;datetime.jdbc&quot;,&quot;date&quot;,&quot;date.jdbc&quot;,&quot;time&quot;,&quot;time.jdbc&quot;,&quot;milliseconds&quot;}
		// [i] field:0:optional $factor
		// [o] field:0:optional $duration
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		  String duration = IDataUtil.getString(cursor, "$duration");
		  String inPattern = IDataUtil.getString(cursor, "$pattern.input");
		  String outPattern = IDataUtil.getString(cursor, "$pattern.output");
		  String datetime = IDataUtil.getString(cursor, "$datetime");
		  String datetimePattern = IDataUtil.getString(cursor, "$datetime.pattern");
		  String factor = IDataUtil.getString(cursor, "$factor");
		
		  duration = multiply(duration, factor, datetime, inPattern, outPattern, datetimePattern);
		
		  if (duration != null) IDataUtil.put(cursor, "$duration", duration);
		} finally {
		  cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void negate (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(negate)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $duration
		// [i] field:0:optional $pattern.input {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [i] field:0:optional $pattern.output {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [o] field:0:optional $duration
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		  String duration = IDataUtil.getString(cursor, "$duration");
		  String inPattern = IDataUtil.getString(cursor, "$pattern.input");
		  String outPattern = IDataUtil.getString(cursor, "$pattern.output");
		
		  duration = negate(duration, inPattern, outPattern);
		
		  if (duration != null) IDataUtil.put(cursor, "$duration", duration);
		} finally {
		  cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void subtract (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(subtract)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $duration.x
		// [i] field:0:optional $duration.y
		// [i] field:0:optional $pattern.input {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [i] field:0:optional $pattern.output {&quot;xml&quot;,&quot;milliseconds&quot;,&quot;seconds&quot;,&quot;minutes&quot;,&quot;hours&quot;,&quot;days&quot;,&quot;weeks&quot;,&quot;months&quot;,&quot;years&quot;}
		// [o] field:0:optional $duration
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		  String x = IDataUtil.getString(cursor, "$duration.x");
		  String y = IDataUtil.getString(cursor, "$duration.y");
		  String inPattern = IDataUtil.getString(cursor, "$pattern.input");
		  String outPattern = IDataUtil.getString(cursor, "$pattern.output");
		
		  String result = subtract(x, y, inPattern, outPattern);
		
		  if (result != null) IDataUtil.put(cursor, "$duration", result);
		} finally {
		  cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	public static final String DEFAULT_DURATION_PATTERN = "xml";
	
	private static final long MILLISECONDS_PER_SECOND = 1000;
	private static final long MILLISECONDS_PER_MINUTE =   60 * MILLISECONDS_PER_SECOND;
	private static final long MILLISECONDS_PER_HOUR   =   60 * MILLISECONDS_PER_MINUTE;
	private static final long MILLISECONDS_PER_DAY    =   24 * MILLISECONDS_PER_HOUR;
	private static final long MILLISECONDS_PER_WEEK   =    7 * MILLISECONDS_PER_DAY;
	
	private static javax.xml.datatype.DatatypeFactory factory = null;
	
	// constructs a java xml duration factory
	private static javax.xml.datatype.DatatypeFactory factory() {
	  try {
	    if (factory == null) factory = javax.xml.datatype.DatatypeFactory.newInstance();
	  } catch (javax.xml.datatype.DatatypeConfigurationException ex) {
	    throw new RuntimeException(ex.getClass().getName() + ": " + ex.getMessage());
	  }
	  
	  return factory;
	}
	
	// formats a duration string to the desired pattern
	public static String format(String duration, String inPattern, String outPattern) {
	  return format(duration, inPattern, outPattern, null);
	}
	
	// formats a duration string to the desired pattern
	public static String format(String duration, String inPattern, String outPattern, String datetime) {
	  return format(duration, inPattern, outPattern, datetime, null);
	}
	
	// formats a duration string to the desired pattern
	public static String format(String duration, String inPattern, String outPattern, String datetime, String datetimePattern) {
	  return emit(parse(duration, inPattern), outPattern, datetime, datetimePattern);
	}
	
	// formats a list of duration strings to the desired pattern
	public static String[] format(String[] durations, String inPattern, String outPattern) {
	  return format(durations, inPattern, outPattern, null);
	}
	
	// formats a list of duration strings to the desired pattern
	public static String[] format(String[] durations, String inPattern, String outPattern, String datetime) {
	  return format(durations, inPattern, outPattern, datetime, null);
	}
	
	// formats a list of duration strings to the desired pattern
	public static String[] format(String[] durations, String inPattern, String outPattern, String datetime, String datetimePattern) {
	  String[] results = null;
	  if (durations != null) {
	    results = new String[durations.length];
	
	    for (int i = 0; i < durations.length; i++) {
	      results[i] = tundra.duration.format(durations[i], inPattern, outPattern, datetime, datetimePattern);
	    }
	  }
	  return results;
	}
	
	// returns the sum of the given durations
	public static String add(String[] durations, String inPattern, String outPattern) {
	  javax.xml.datatype.Duration dz = factory().newDuration(0);
	  if (durations != null) {
	    for (int i = 0; i < durations.length; i++) {
	      javax.xml.datatype.Duration dx = parse(durations[i], inPattern);
	      if (dx != null) dz = dz.add(dx);
	    }
	  }
	  return emit(dz, outPattern);
	}
	
	// returns the sum of the given durations
	public static String add(String[] durations) {
	  return add(durations, null);
	}
	
	// returns the sum of the given durations
	public static String add(String[] durations, String pattern) {
	  return add(durations, pattern, pattern);
	}
	
	// returns the sum of the given durations
	public static String add(String inPattern, String outPattern, String ... durations) {
	  return add(durations, inPattern, outPattern);
	}
	
	// subtracts one duration from another returning (x - y)
	public static String subtract(String x, String y, String inPattern, String outPattern) {
	  javax.xml.datatype.Duration dx = x == null? factory().newDuration(0) : parse(x, inPattern);
	  javax.xml.datatype.Duration dy = y == null? factory().newDuration(0) : parse(y, inPattern);
	  javax.xml.datatype.Duration dz = dx.subtract(dy);
	  return emit(dz, outPattern);
	
	}
	
	// subtracts one duration from another returning (x - y)
	public static String subtract(String x, String y, String pattern) {
	  return subtract(x, y, pattern, null);
	}
	
	// subtracts one duration from another returning (x - y)
	public static String subtract(String x, String y) {
	  return subtract(x, y, null);
	}
	
	// compares two durations, returning one of the following values:
	// - javax.xml.datatype.DatatypeConstants.LESSER if this Duration is shorter than duration parameter
	// - javax.xml.datatype.DatatypeConstants.EQUAL if this Duration is equal to duration parameter
	// - javax.xml.datatype.DatatypeConstants.GREATER if this Duration is longer than duration parameter
	// - javax.xml.datatype.DatatypeConstants.INDETERMINATE if a conclusive partial order relation cannot be determined
	public static int compare(String x, String y, String pattern) {
	  if (x == null && y == null) return javax.xml.datatype.DatatypeConstants.EQUAL;
	  if (x == null || y == null) return javax.xml.datatype.DatatypeConstants.INDETERMINATE;
	  
	  return parse(x, pattern).compare(parse(y, pattern));
	}
	
	// compares two durations, returning one of the following values:
	// - javax.xml.datatype.DatatypeConstants.LESSER if this Duration is shorter than duration parameter
	// - javax.xml.datatype.DatatypeConstants.EQUAL if this Duration is equal to duration parameter
	// - javax.xml.datatype.DatatypeConstants.GREATER if this Duration is longer than duration parameter
	// - javax.xml.datatype.DatatypeConstants.INDETERMINATE if a conclusive partial order relation cannot be determined
	public static int compare(String x, String y) {
	  return compare(x, y, null);
	}
	
	// returns a parsed xml duration string
	public static javax.xml.datatype.Duration parse(String duration) {
	  return parse(duration, null);
	}
	
	// returns a parsed duration string with the given pattern
	public static javax.xml.datatype.Duration parse(String input, String pattern) {
	  if (pattern == null) pattern = DEFAULT_DURATION_PATTERN;
	
	  java.math.BigInteger zero = new java.math.BigInteger("0");  
	  javax.xml.datatype.Duration output = null;
	  
	  if (input != null) {
	    if (pattern.equals("milliseconds")) {
	      java.math.BigDecimal zero_ = new java.math.BigDecimal("0");
	      java.math.BigDecimal value = (new java.math.BigDecimal(input)).divide(new java.math.BigDecimal(1000));
	      output = factory().newDuration(value.compareTo(zero_) >= 0, null, null, null, null, null, value.abs());
	    } else if (pattern.equals("seconds")) {
	      java.math.BigDecimal zero_ = new java.math.BigDecimal("0");
	      java.math.BigDecimal value = new java.math.BigDecimal(input);
	      output = factory().newDuration(value.compareTo(zero_) >= 0, null, null, null, null, null, value.abs());
	    } else if (pattern.equals("minutes")) {
	      java.math.BigInteger value = new java.math.BigInteger(input);
	      output = factory().newDuration(value.compareTo(zero) >= 0, null, null, null, null, value.abs(), null);
	    } else if (pattern.equals("hours")) {
	      java.math.BigInteger value = new java.math.BigInteger(input);
	      output = factory().newDuration(value.compareTo(zero) >= 0, null, null, null, value.abs(), null, null);
	    } else if (pattern.equals("days")) {
	      java.math.BigInteger value = new java.math.BigInteger(input);
	      output = factory().newDuration(value.compareTo(zero) >= 0, null, null, value.abs(), null, null, null);
	    } else if (pattern.equals("weeks")) {
	      // convert weeks to days by multiplying by 7
	      java.math.BigInteger value = (new java.math.BigInteger(input)).multiply(new java.math.BigInteger("7"));
	      output = factory().newDuration(value.compareTo(zero) >= 0, null, null, value.abs(), null, null, null);
	    } else if (pattern.equals("months")) {
	      java.math.BigInteger value = new java.math.BigInteger(input);
	      output = factory().newDuration(value.compareTo(zero) >= 0, null, value.abs(), null, null, null, null);
	    } else if (pattern.equals("years")) {
	      java.math.BigInteger value = new java.math.BigInteger(input);
	      output = factory().newDuration(value.compareTo(zero) >= 0, value.abs(), null, null, null, null, null);
	    } else if (pattern.equals("xml")) {
	      output = factory().newDuration(input);
	    } else {
	      throw new IllegalArgumentException("Unparseable pattern: " + pattern);
	    }
	  }
	
	  return output;
	}
	
	// returns an xml formatted duration string
	public static String emit(javax.xml.datatype.Duration input) {
	  return emit(input, null, null);
	}
	
	// returns an xml formatted duration string
	public static String emit(javax.xml.datatype.Duration input, String pattern) {
	  return emit(input, pattern, null);
	}
	
	// returns an xml formatted duration string
	public static String emit(javax.xml.datatype.Duration input, String pattern, String datetime) {
	  return emit(input, pattern, datetime, null);
	}
	
	// returns a formatted duration string for the given period
	private static String emit(javax.xml.datatype.Duration input, String pattern, String datetime, String datetimePattern) {
	  if (pattern == null) pattern = DEFAULT_DURATION_PATTERN;
	  
	  java.util.Date instant = null;
	  if (datetime == null) {
	    instant = new java.util.Date();
	  } else {
	    instant = tundra.datetime.parse(datetime, datetimePattern).getTime();
	  }
	  
	  String output = null;
	  
	  if (input != null) {
	    if (pattern.equals("milliseconds")) {
	      output = "" + input.getTimeInMillis(instant);
	    } else if (pattern.equals("seconds")) {
	      output = "" + (input.getTimeInMillis(instant) / MILLISECONDS_PER_SECOND);
	    } else if (pattern.equals("minutes")) {
	      output = "" + (input.getTimeInMillis(instant) / MILLISECONDS_PER_MINUTE);
	    } else if (pattern.equals("hours")) {
	      output = "" + (input.getTimeInMillis(instant) / MILLISECONDS_PER_HOUR);
	    } else if (pattern.equals("days")) {
	      output = "" + (input.getTimeInMillis(instant) / MILLISECONDS_PER_DAY);
	    } else if (pattern.equals("weeks")) {
	      output = "" + (input.getTimeInMillis(instant) / MILLISECONDS_PER_WEEK);
	    } else if (pattern.equals("xml")) {
	      output = input.toString();
	    } else {
	      throw new IllegalArgumentException("Unparseable pattern: " + pattern);
	    }
	  }
	  
	  return output;
	}
	
	// computes a new duration by multiplying the given duration by the given factor
	public static String multiply(String duration, String factor, String datetime, String inPattern, String outPattern, String datetimePattern) {
	  if (duration == null || factor == null) return duration;
	
	  java.util.Calendar instant = null;
	  if (datetime == null) {
	    instant = java.util.Calendar.getInstance();
	  } else {
	    instant = tundra.datetime.parse(datetime, datetimePattern);
	  }
	
	  return emit(parse(duration, inPattern).normalizeWith(instant).multiply(new java.math.BigDecimal(factor)), outPattern);
	}
	
	// computes a new duration by multiplying the given duration by the given factor
	public static String multiply(String duration, String factor, String datetime) {
	  return multiply(duration, factor, datetime, null, null, null);
	}
	
	// reverses the sign of the given duration
	public static String negate(String duration, String inPattern, String outPattern) {
	  if (duration == null) return null;
	  return emit(parse(duration, inPattern).negate(), outPattern);
	}
	
	// reverses the sign of the given duration
	public static String negate(String duration, String pattern) {
	  return negate(duration, pattern, null);
	}
	
	// reverses the sign of the given duration
	public static String negate(String duration) {
	  return negate(duration, null);
	}
	// --- <<IS-END-SHARED>> ---
}

