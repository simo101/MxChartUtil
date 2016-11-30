// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies;

public class DynamicChartObjects
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dynamicChartObjectsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Main.DynamicChartObjects";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		XValue("XValue"),
		YValue("YValue"),
		label("label"),
		DynamicChartObjects_DynamicMultiSeriesChartDefinition("Main.DynamicChartObjects_DynamicMultiSeriesChartDefinition");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DynamicChartObjects(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Main.DynamicChartObjects"));
	}

	protected DynamicChartObjects(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dynamicChartObjectsMendixObject)
	{
		if (dynamicChartObjectsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Main.DynamicChartObjects", dynamicChartObjectsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Main.DynamicChartObjects");

		this.dynamicChartObjectsMendixObject = dynamicChartObjectsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DynamicChartObjects.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static main.proxies.DynamicChartObjects initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return main.proxies.DynamicChartObjects.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static main.proxies.DynamicChartObjects initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new main.proxies.DynamicChartObjects(context, mendixObject);
	}

	public static main.proxies.DynamicChartObjects load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return main.proxies.DynamicChartObjects.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of XValue
	 */
	public final java.lang.String getXValue()
	{
		return getXValue(getContext());
	}

	/**
	 * @param context
	 * @return value of XValue
	 */
	public final java.lang.String getXValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.XValue.toString());
	}

	/**
	 * Set value of XValue
	 * @param xvalue
	 */
	public final void setXValue(java.lang.String xvalue)
	{
		setXValue(getContext(), xvalue);
	}

	/**
	 * Set value of XValue
	 * @param context
	 * @param xvalue
	 */
	public final void setXValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xvalue)
	{
		getMendixObject().setValue(context, MemberNames.XValue.toString(), xvalue);
	}

	/**
	 * @return value of YValue
	 */
	public final java.lang.String getYValue()
	{
		return getYValue(getContext());
	}

	/**
	 * @param context
	 * @return value of YValue
	 */
	public final java.lang.String getYValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.YValue.toString());
	}

	/**
	 * Set value of YValue
	 * @param yvalue
	 */
	public final void setYValue(java.lang.String yvalue)
	{
		setYValue(getContext(), yvalue);
	}

	/**
	 * Set value of YValue
	 * @param context
	 * @param yvalue
	 */
	public final void setYValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String yvalue)
	{
		getMendixObject().setValue(context, MemberNames.YValue.toString(), yvalue);
	}

	/**
	 * @return value of label
	 */
	public final java.lang.String getlabel()
	{
		return getlabel(getContext());
	}

	/**
	 * @param context
	 * @return value of label
	 */
	public final java.lang.String getlabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.label.toString());
	}

	/**
	 * Set value of label
	 * @param label
	 */
	public final void setlabel(java.lang.String label)
	{
		setlabel(getContext(), label);
	}

	/**
	 * Set value of label
	 * @param context
	 * @param label
	 */
	public final void setlabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String label)
	{
		getMendixObject().setValue(context, MemberNames.label.toString(), label);
	}

	/**
	 * @return value of DynamicChartObjects_DynamicMultiSeriesChartDefinition
	 */
	public final main.proxies.DynamicMultiSeriesChartDefinition getDynamicChartObjects_DynamicMultiSeriesChartDefinition() throws com.mendix.core.CoreException
	{
		return getDynamicChartObjects_DynamicMultiSeriesChartDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicChartObjects_DynamicMultiSeriesChartDefinition
	 */
	public final main.proxies.DynamicMultiSeriesChartDefinition getDynamicChartObjects_DynamicMultiSeriesChartDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.DynamicMultiSeriesChartDefinition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicChartObjects_DynamicMultiSeriesChartDefinition.toString());
		if (identifier != null)
			result = main.proxies.DynamicMultiSeriesChartDefinition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicChartObjects_DynamicMultiSeriesChartDefinition
	 * @param dynamicchartobjects_dynamicmultiserieschartdefinition
	 */
	public final void setDynamicChartObjects_DynamicMultiSeriesChartDefinition(main.proxies.DynamicMultiSeriesChartDefinition dynamicchartobjects_dynamicmultiserieschartdefinition)
	{
		setDynamicChartObjects_DynamicMultiSeriesChartDefinition(getContext(), dynamicchartobjects_dynamicmultiserieschartdefinition);
	}

	/**
	 * Set value of DynamicChartObjects_DynamicMultiSeriesChartDefinition
	 * @param context
	 * @param dynamicchartobjects_dynamicmultiserieschartdefinition
	 */
	public final void setDynamicChartObjects_DynamicMultiSeriesChartDefinition(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.DynamicMultiSeriesChartDefinition dynamicchartobjects_dynamicmultiserieschartdefinition)
	{
		if (dynamicchartobjects_dynamicmultiserieschartdefinition == null)
			getMendixObject().setValue(context, MemberNames.DynamicChartObjects_DynamicMultiSeriesChartDefinition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicChartObjects_DynamicMultiSeriesChartDefinition.toString(), dynamicchartobjects_dynamicmultiserieschartdefinition.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dynamicChartObjectsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final main.proxies.DynamicChartObjects that = (main.proxies.DynamicChartObjects) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Main.DynamicChartObjects";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
