package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	ItemGroup get(int id);
	List<ItemGroup> search(String name);
	void saveOrUpdate(ItemGroup itemGroup);
	List<ItemGroup> getItemGroupDetails();
}
