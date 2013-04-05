/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.samples.conference.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emf.samples.conference.util.ConferenceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferenceItemProviderAdapterFactory extends ConferenceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.samples.conference.Conference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceItemProvider conferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.samples.conference.Conference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Adapter createConferenceAdapter() {
		if (conferenceItemProvider == null) {
			conferenceItemProvider = new ConferenceItemProvider(this);
		}

		return conferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.samples.conference.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.samples.conference.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.samples.conference.Session} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionItemProvider sessionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.samples.conference.Session}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Adapter createSessionAdapter() {
		if (sessionItemProvider == null) {
			sessionItemProvider = new SessionItemProvider(this);
		}

		return sessionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.samples.conference.Venue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VenueItemProvider venueItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.samples.conference.Venue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Adapter createVenueAdapter() {
		if (venueItemProvider == null) {
			venueItemProvider = new VenueItemProvider(this);
		}

		return venueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.samples.conference.Room} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomItemProvider roomItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.samples.conference.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Adapter createRoomAdapter() {
		if (roomItemProvider == null) {
			roomItemProvider = new RoomItemProvider(this);
		}

		return roomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.samples.conference.Schedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleItemProvider scheduleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.samples.conference.Schedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Adapter createScheduleAdapter() {
		if (scheduleItemProvider == null) {
			scheduleItemProvider = new ScheduleItemProvider(this);
		}

		return scheduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.samples.conference.SessionSchedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionScheduleItemProvider sessionScheduleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.samples.conference.SessionSchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Adapter createSessionScheduleAdapter() {
		if (sessionScheduleItemProvider == null) {
			sessionScheduleItemProvider = new SessionScheduleItemProvider(this);
		}

		return sessionScheduleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (conferenceItemProvider != null) conferenceItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
		if (sessionItemProvider != null) sessionItemProvider.dispose();
		if (venueItemProvider != null) venueItemProvider.dispose();
		if (roomItemProvider != null) roomItemProvider.dispose();
		if (scheduleItemProvider != null) scheduleItemProvider.dispose();
		if (sessionScheduleItemProvider != null) sessionScheduleItemProvider.dispose();
	}

}
