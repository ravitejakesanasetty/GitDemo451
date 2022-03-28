package com.teja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ProductDiscount {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// how to call this method need 2 i/p of the method findlowestPrice( products,
		// discounts);

	}

	public static int findlowestPrice(List<List<String>> products, List<List<String>> discounts) {
		if (products.size() < 1 || discounts.size() > 1000) {
			return 0;
		}
		HashMap<String, String> map = new HashMap<>();
		for (List<String> discount : discounts) {
			if (map.containsKey(discount.get(0) + "-" + discount.get(1)) == false) {
				map.put(discount.get(0) + "-" + discount.get(1), discount.get(2));
			}
		}

		List<Double> prices = new ArrayList<>(products.size());
		for (List<String> product : products) {
			int basePrice = Integer.parseInt(product.get(0));
			List<Double> discountedPrices = new ArrayList<>(discounts.size());
			for (int i = 1; i < product.size(); i++) {
				if (map.containsKey(product.get(i) + "-" + "0") == true) {
					double discountValue = Double.parseDouble(map.get(product.get(i) + "-" + "0"));
					discountedPrices.add((double) Math.round(discountValue));
				} else if (map.containsKey(product.get(i) + "-" + "1") == true) {
					double discountValue = Double.parseDouble(map.get(product.get(i) + "-" + "1"));
					discountedPrices.add((double) Math.round(basePrice - basePrice * discountValue / 100));
				} else if (map.containsKey(product.get(i) + "-" + "2") == true) {
					double discountValue = Double.parseDouble(map.get(product.get(i) + "-" + "2"));
					discountedPrices.add((double) Math.round(basePrice - discountValue));
				}
			}
			if (discountedPrices.size() > 0) {
				prices.add(Collections.min(discountedPrices));
			}
		}
		int sum = prices.stream().mapToInt(Double::intValue).sum();
		return sum;

	}

}
