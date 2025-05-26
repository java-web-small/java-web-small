package org.springframework.samples.petclinic.duplicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class này được tạo để kiểm tra chức năng phát hiện code trùng lặp của SonarQube
 */
public class DuplicateCodeTest2 {

	// Block code trùng lặp #1
	public List<String> processData(String[] inputs) {
		List<String> results = new ArrayList<>();
		for (String input : inputs) {
			if (input != null && !input.trim().isEmpty()) {
				String processed = input.toLowerCase().trim();
				processed = processed.replaceAll("[^a-z0-9]", "");
				results.add(processed);
			}
		}
		return results;
	}

	// Block code trùng lặp #2 (copy của #1)
	public List<String> processUserInput(String[] userInputs) {
		List<String> results = new ArrayList<>();
		for (String input : userInputs) {
			if (input != null && !input.trim().isEmpty()) {
				String processed = input.toLowerCase().trim();
				processed = processed.replaceAll("[^a-z0-9]", "");
				results.add(processed);
			}
		}
		return results;
	}

	// Block code trùng lặp #3 (copy của #1)
	public List<String> cleanStrings(String[] dirtyStrings) {
		List<String> results = new ArrayList<>();
		for (String input : dirtyStrings) {
			if (input != null && !input.trim().isEmpty()) {
				String processed = input.toLowerCase().trim();
				processed = processed.replaceAll("[^a-z0-9]", "");
				results.add(processed);
			}
		}
		return results;
	}

	// Block code trùng lặp #4 (một block lớn khác)
	public Map<String, Integer> countFrequency(List<String> items) {
		Map<String, Integer> frequency = new HashMap<>();
		for (String item : items) {
			if (item == null)
				continue;

			if (frequency.containsKey(item)) {
				frequency.put(item, frequency.get(item) + 1);
			}
			else {
				frequency.put(item, 1);
			}
		}

		// Sort by frequency (không cần thiết nhưng thêm để có thêm code trùng lặp)
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequency.entrySet());
		entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

		Map<String, Integer> sortedFrequency = new HashMap<>();
		for (Map.Entry<String, Integer> entry : entries) {
			sortedFrequency.put(entry.getKey(), entry.getValue());
		}

		return sortedFrequency;
	}

	// Block code trùng lặp #5 (copy của #4)
	public Map<String, Integer> calculateWordFrequency(List<String> words) {
		Map<String, Integer> frequency = new HashMap<>();
		for (String item : words) {
			if (item == null)
				continue;

			if (frequency.containsKey(item)) {
				frequency.put(item, frequency.get(item) + 1);
			}
			else {
				frequency.put(item, 1);
			}
		}

		// Sort by frequency
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequency.entrySet());
		entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

		Map<String, Integer> sortedFrequency = new HashMap<>();
		for (Map.Entry<String, Integer> entry : entries) {
			sortedFrequency.put(entry.getKey(), entry.getValue());
		}

		return sortedFrequency;
	}

	// Block code trùng lặp #6 (một block khác)
	public void processDateRange(LocalDate startDate, LocalDate endDate) {
		if (startDate == null || endDate == null) {
			throw new IllegalArgumentException("Dates cannot be null");
		}

		if (startDate.isAfter(endDate)) {
			throw new IllegalArgumentException("Start date must be before end date");
		}

		System.out.println("Processing date range from3123123123123123123123123123 " + startDate + " to " + endDate);

		LocalDate currentDate = startDate;
		while (!currentDate.isAfter(endDate)) {
			System.out.println("Processing date: " + currentDate);
			processSpecificDate(currentDate);
			currentDate = currentDate.plusDays(1);
		}

		System.out.println("Finished processing date range");
	}

	// Block code trùng lặp #7 (copy của #6)
	public void handleDatePeriod(LocalDate beginDate, LocalDate finishDate) {
		if (beginDate == null || finishDate == null) {
			throw new IllegalArgumentException("Dates cannot be null");
		}

		if (beginDate.isAfter(finishDate)) {
			throw new IllegalArgumentException("Start date must be before end date");
		}

		System.out.println("Processing date range from " + beginDate + " to " + finishDate);

		LocalDate currentDate = beginDate;
		while (!currentDate.isAfter(finishDate)) {
			System.out.println("Processing date: " + currentDate);
			processSpecificDate(currentDate);
			currentDate = currentDate.plusDays(1);
		}

		System.out.println("Finished processing date range");
	}

	private void processSpecificDate(LocalDate date) {
		// Xử lý ngày cụ thể
	}

}