package tundra.collection.list;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-04-14 08:17:38.807
// -----( ON-HOST: 192.168.66.129

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Collection;
import java.util.List;
import permafrost.tundra.collection.CollectionHelper;
import permafrost.tundra.collection.ListHelper;
import permafrost.tundra.data.IDataHelper;
import permafrost.tundra.lang.BooleanHelper;
import permafrost.tundra.lang.ExceptionHelper;
import permafrost.tundra.math.IntegerHelper;
// --- <<IS-END-IMPORTS>> ---

public final class object

{
	// ---( internal utility methods )---

	final static object _instance = new object();

	static object _newInstance() { return new object(); }

	static object _cast(Object o) { return (object)o; }

	// ---( server methods )---




	public static final void append (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(append)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] record:0:optional $items
		// [i] field:0:optional $class
		// [o] object:0:required $list
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    append(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void arrayify (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(arrayify)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:optional $class
		// [o] object:1:optional $array
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    arrayify(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void clear (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(clear)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:optional $class
		// [o] object:0:required $list
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    clear(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void first (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(first)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:optional $class
		// [o] object:0:optional $item
		// [o] field:0:required $item.exists?
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    first(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void get (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(get)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:required $index
		// [i] field:0:optional $index.base {&quot;0&quot;,&quot;1&quot;}
		// [i] field:0:optional $class
		// [o] object:0:optional $item
		// [o] field:0:required $item.exists?
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    get(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void insert (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(insert)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] record:0:optional $items
		// [i] field:0:required $index
		// [i] field:0:optional $index.base {&quot;0&quot;,&quot;1&quot;}
		// [i] field:0:optional $class
		// [o] object:0:required $list
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    insert(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void last (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(last)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:optional $class
		// [o] object:0:optional $item
		// [o] field:0:required $item.exists?
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    first(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void length (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(length)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] field:0:required $length
		IDataCursor cursor = pipeline.getCursor();

		try {
		    Collection collection = (Collection)IDataUtil.get(cursor, "$list");
		    IDataUtil.put(cursor, "$length", IntegerHelper.emit(CollectionHelper.length(collection)));
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void listify (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(listify)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:1:optional $array
		// [i] field:0:optional $class
		// [o] object:0:optional $list
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    listify(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void prepend (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(prepend)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] record:0:optional $items
		// [i] field:0:optional $class
		// [o] object:0:required $list
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    prepend(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void remove (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(remove)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:required $index
		// [i] field:0:optional $index.base {&quot;0&quot;,&quot;1&quot;}
		// [i] field:0:optional $class
		// [o] object:0:optional $item
		// [o] field:0:required $item.exists?
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    remove(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void reverse (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(reverse)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] object:0:optional $list.reverse
		IDataCursor cursor = pipeline.getCursor();

		try {
		    List list = (List)IDataUtil.get(cursor, "$list");
		    if (list != null) IDataUtil.put(cursor, "$list.reverse", ListHelper.reverse(list));
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void set (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(set)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] object:0:optional $item.new
		// [i] field:0:required $index
		// [i] field:0:optional $index.base {&quot;0&quot;,&quot;1&quot;}
		// [i] field:0:optional $class
		// [o] object:0:optional $item.old
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    set(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void take (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(take)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:required $count
		// [i] field:0:optional $class
		// [o] object:0:optional $list.head
		IDataCursor cursor = pipeline.getCursor();

		try {
		    String className = IDataUtil.getString(cursor, "$class");
		    take(pipeline, className == null ? Object.class : Class.forName(className));
		} catch (ClassNotFoundException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void unique (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unique)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] object:0:optional $list.unique
		IDataCursor cursor = pipeline.getCursor();

		try {
		    List list = (List)IDataUtil.get(cursor, "$list");
		    if (list != null) IDataUtil.put(cursor, "$list.unique", ListHelper.unique(list));
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}

	// --- <<IS-START-SHARED>> ---
	/**
	 * Appends the given items to the given java.util.List.
	 *
	 * @param pipeline The pipeline containing the list and items to be appended.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void append(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        IData items = IDataUtil.getIData(cursor, "$items");
	        IDataUtil.put(cursor, "$list", ListHelper.append(list, (T[])IDataHelper.getLeafValues(items, klass)));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Returns a new array representation of the given java.util.List object.
	 *
	 * @param pipeline The pipeline containing the list to be converted to an array.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void arrayify(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        if (list != null) IDataUtil.put(cursor, "$array", CollectionHelper.arrayify(list, klass));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Prepends the given items to the given java.util.List.
	 *
	 * @param pipeline The pipeline containing the list and items to be prepended.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void clear(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List list = (List)IDataUtil.get(cursor, "$list");
	        IDataUtil.put(cursor, "$list", ListHelper.clear(list, klass));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Returns the first item from the given java.util.List.
	 *
	 * @param pipeline The pipeline containing the list.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void first(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        int index = 0;
	        boolean exists = ListHelper.exists(list, index);

	        if (exists) IDataUtil.put(cursor, "$item", ListHelper.get(list, index));
	        IDataUtil.put(cursor, "$item.exists?", BooleanHelper.emit(exists));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Returns the item from the given java.util.List at the given index.
	 *
	 * @param pipeline The pipeline containing the list and index of the required item.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void get(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        int indexBase = IntegerHelper.parse(IDataUtil.getString(cursor, "$index.base"), 0);
	        int index = IntegerHelper.parse(IDataUtil.getString(cursor, "$index")) - indexBase;
	        boolean exists = ListHelper.exists(list, index);

	        if (exists) IDataUtil.put(cursor, "$item", ListHelper.get(list, index));
	        IDataUtil.put(cursor, "$item.exists?", BooleanHelper.emit(exists));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Inserts the given items to the given java.util.List.
	 *
	 * @param pipeline The pipeline containing the list and items to be inserted.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void insert(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        IData items = IDataUtil.getIData(cursor, "$items");
	        int indexBase = IntegerHelper.parse(IDataUtil.getString(cursor, "$index.base"), 0);
	        int index = IntegerHelper.parse(IDataUtil.getString(cursor, "$index")) - indexBase;
	        IDataUtil.put(cursor, "$list", ListHelper.insert(list, index, (T[])IDataHelper.getLeafValues(items, klass)));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Returns the last item from the given java.util.List.
	 *
	 * @param pipeline The pipeline containing the list.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void last(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        int index = -1;
	        boolean exists = ListHelper.exists(list, index);

	        if (exists) IDataUtil.put(cursor, "$item", ListHelper.get(list, index));
	        IDataUtil.put(cursor, "$item.exists?", BooleanHelper.emit(exists));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Returns a new java.util.List representation of the given array.
	 *
	 * @param pipeline The pipeline containing the array to be converted to a list.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void listify(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        T[] array = (T[])IDataUtil.getObjectArray(cursor, "$array");
	        if (array != null) IDataUtil.put(cursor, "$list", ListHelper.listify(array, klass));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Prepends the given items to the given java.util.List.
	 *
	 * @param pipeline The pipeline containing the list and items to be prepended.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void prepend(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        IData items = IDataUtil.getIData(cursor, "$items");
	        IDataUtil.put(cursor, "$list", ListHelper.prepend(list, (T[])IDataHelper.getLeafValues(items, klass)));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Removes the item from the given java.util.List at the given index.
	 *
	 * @param pipeline The pipeline containing the list, and index.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void remove(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        int indexBase = IntegerHelper.parse(IDataUtil.getString(cursor, "$index.base"), 0);
	        int index = IntegerHelper.parse(IDataUtil.getString(cursor, "$index")) - indexBase;
	        boolean exists = ListHelper.exists(list, index);

	        if (exists) IDataUtil.put(cursor, "$item", ListHelper.remove(list, index));
	        IDataUtil.put(cursor, "$item.exists?", BooleanHelper.emit(exists));
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Sets the item in the given java.util.List at the given index.
	 *
	 * @param pipeline The pipeline containing the list, item, and index.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void set(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        if (list != null) {
	            T item = (T)IDataUtil.get(cursor, "$item.new");
	            int indexBase = IntegerHelper.parse(IDataUtil.getString(cursor, "$index.base"), 0);
	            int index = IntegerHelper.parse(IDataUtil.getString(cursor, "$index")) - indexBase;
	            IDataUtil.put(cursor, "$item.old", ListHelper.set(list, index, item));
	        }
	    } finally {
	        cursor.destroy();
	    }
	}

	/**
	 * Removes and returns a specified number of items from the head of the given java.util.List.
	 *
	 * @param pipeline The pipeline containing the list, and count.
	 * @param klass    The component type of the list.
	 * @param <T>      The component type of the list.
	 */
	public static <T> void take(IData pipeline, Class<T> klass) {
	    IDataCursor cursor = pipeline.getCursor();

	    try {
	        List<T> list = (List<T>)IDataUtil.get(cursor, "$list");
	        int count = IntegerHelper.parse(IDataUtil.getString(cursor, "$count"));

	        if (list != null) IDataUtil.put(cursor, "$list.head", ListHelper.take(list, count));
	    } finally {
	        cursor.destroy();
	    }
	}
	// --- <<IS-END-SHARED>> ---
}

